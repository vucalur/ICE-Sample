#!/usr/bin/python
import sys, traceback, Ice
Ice.loadSlice("./slice/MiddlewareTestbed.ice")
import MiddlewareTestbed
from MiddlewareTestbed import *

owned = {}

def performCustomItemOperation(item):
	if item.ice_isA("::MiddlewareTestbed::ItemA"):
		# void actionA(float a, out long b);
		
		item = MiddlewareTestbed.ItemAPrx.uncheckedCast(item)
		print("Recognised item A. Insert a float");
		print '>',
		line = str(raw_input()).split(' ')[0]
		a = float(line)
		print(item.ice_ids())
		print(item.ice_id())
		b = item.actionA(a)
		print("Invocation returned (out param) b: " + str(b))
	elif item.ice_isA("::MiddlewareTestbed::ItemB"):
		# float actionB(string a);
		
		item = MiddlewareTestbed.ItemBPrx.uncheckedCast(item)
		print("Recognised item B. Insert a string")
		print '>',
		line = str(raw_input())
		f = item.actionB(line)
		print("Invocation returned value: " + str(f))
	elif item.ice_isA("::MiddlewareTestbed::ItemC"):
		# void actionC(long aIn, out long aOut, out short b);
		
		item = MiddlewareTestbed.ItemCPrx.uncheckedCast(item)
		print("Recognised item C. Insert a long");
		print '>',
		aIn = long(str(raw_input()).split(' ')[0])
		aOut, b = item.actionC(aIn)
		print("Invocation returned (out param) a: " + str(aOut) + ", (out param) b: " + str(b))
	else:
		print("Unsupported dynamic type")


def performAction(item):
	print("Available actions: getName(n), getAge(a), performAction(p)")
	line = ''
	while (line != None):
		print '>',
		line = str(raw_input());
		if line.startswith("n"):
			print('item name: ' + item.getName())
		elif line.startswith("a"):
			print('item age: ' + str(item.getItemAge()))
		elif line.startswith("p"):
			performCustomItemOperation(item)
		else:				
			print("Unknown command. Try again")
			continue
		return


def run(factory):
	print("Available commands: listOwned(o), action(a) <name>, create(c) <type> <name>, take(t) <name>, release(r) <name>\nTo quit: ^C")
	line = ''
	while (line != None):
		print '>',
		line = str(raw_input());
		if line.startswith("o"):
			for name in owned.keys():
				print(name)
		elif line.startswith("a "):
			try:
				name = line.split(' ')[1]
				if not name in owned:
					print("You don't own item " + name)
				else:
					try:
						performAction(owned[name])
					except Exception as deatail:
						print('Technical problem encountered: ', deatail)
			except IndexError:
				print('to few arguments')
		elif line.startswith("c "):
			try:
				typee, name = line.split(' ')[1], line.split(' ')[2]
				try:
					factory.createItem(name, typee)
				except ItemAlreadyExists as e:
					print(e)
			except IndexError:
				print('to few arguments')
		elif line.startswith("t "):
			try:
				name = line.split(' ')[1]
				try:
					item = factory.takeItem(name)
					owned[name] = item
				except (ItemNotExists, ItemBusy) as e:
					print(e)
			except IndexError:
				print('to few arguments')
		elif line.startswith("r "):
			try:
				name = line.split(' ')[1]
				try:
					factory.releaseItem(name)
					del owned[name]
				except ItemNotExists as e:
					print(e)
			except IndexError:
				print('to few arguments')
		else:				
			print("Unknown command. Try again")

status = 0
ic = None
try:
	ic = Ice.initialize(sys.argv)
	base = ic.propertyToProxy("AFactory.Proxy")
	factory = MiddlewareTestbed.AFactoryPrx.checkedCast(base)
	if not factory:
		raise RuntimeError("Invalid proxy")
	run(factory)
except KeyboardInterrupt:
	print('\nQuiting...')
except:
	traceback.print_exc()
	status = 1

if ic:
	# Clean up
	try:
		ic.destroy()
	except:
		traceback.print_exc()
		status = 1

sys.exit(status)




// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.4.2
//
// <auto-generated>
//
// Generated from file `ItemCPrxHelper.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package MiddlewareTestbed;

public final class ItemCPrxHelper extends Ice.ObjectPrxHelperBase implements ItemCPrx
{
    public long
    getItemAge()
    {
        return getItemAge(null, false);
    }

    public long
    getItemAge(java.util.Map<String, String> __ctx)
    {
        return getItemAge(__ctx, true);
    }

    private long
    getItemAge(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getItemAge");
                __delBase = __getDelegate(false);
                _ItemCDel __del = (_ItemCDel)__delBase;
                return __del.getItemAge(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __getItemAge_name = "getItemAge";

    public Ice.AsyncResult begin_getItemAge()
    {
        return begin_getItemAge(null, false, null);
    }

    public Ice.AsyncResult begin_getItemAge(java.util.Map<String, String> __ctx)
    {
        return begin_getItemAge(__ctx, true, null);
    }

    public Ice.AsyncResult begin_getItemAge(Ice.Callback __cb)
    {
        return begin_getItemAge(null, false, __cb);
    }

    public Ice.AsyncResult begin_getItemAge(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getItemAge(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getItemAge(Callback_Item_getItemAge __cb)
    {
        return begin_getItemAge(null, false, __cb);
    }

    public Ice.AsyncResult begin_getItemAge(java.util.Map<String, String> __ctx, Callback_Item_getItemAge __cb)
    {
        return begin_getItemAge(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getItemAge(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getItemAge_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getItemAge_name, __cb);
        try
        {
            __result.__prepare(__getItemAge_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public long end_getItemAge(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getItemAge_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
            }
        }
        long __ret;
        IceInternal.BasicStream __is = __result.__is();
        __is.startReadEncaps();
        __ret = __is.readLong();
        __is.endReadEncaps();
        return __ret;
    }

    public String
    getName()
    {
        return getName(null, false);
    }

    public String
    getName(java.util.Map<String, String> __ctx)
    {
        return getName(__ctx, true);
    }

    private String
    getName(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("getName");
                __delBase = __getDelegate(false);
                _ItemCDel __del = (_ItemCDel)__delBase;
                return __del.getName(__ctx);
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __getName_name = "getName";

    public Ice.AsyncResult begin_getName()
    {
        return begin_getName(null, false, null);
    }

    public Ice.AsyncResult begin_getName(java.util.Map<String, String> __ctx)
    {
        return begin_getName(__ctx, true, null);
    }

    public Ice.AsyncResult begin_getName(Ice.Callback __cb)
    {
        return begin_getName(null, false, __cb);
    }

    public Ice.AsyncResult begin_getName(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getName(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getName(Callback_Item_getName __cb)
    {
        return begin_getName(null, false, __cb);
    }

    public Ice.AsyncResult begin_getName(java.util.Map<String, String> __ctx, Callback_Item_getName __cb)
    {
        return begin_getName(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getName(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getName_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getName_name, __cb);
        try
        {
            __result.__prepare(__getName_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public String end_getName(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getName_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
            }
        }
        String __ret;
        IceInternal.BasicStream __is = __result.__is();
        __is.startReadEncaps();
        __ret = __is.readString();
        __is.endReadEncaps();
        return __ret;
    }

    public void
    actionC(long aIn, Ice.LongHolder aOut, Ice.ShortHolder b)
    {
        actionC(aIn, aOut, b, null, false);
    }

    public void
    actionC(long aIn, Ice.LongHolder aOut, Ice.ShortHolder b, java.util.Map<String, String> __ctx)
    {
        actionC(aIn, aOut, b, __ctx, true);
    }

    private void
    actionC(long aIn, Ice.LongHolder aOut, Ice.ShortHolder b, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __checkTwowayOnly("actionC");
                __delBase = __getDelegate(false);
                _ItemCDel __del = (_ItemCDel)__delBase;
                __del.actionC(aIn, aOut, b, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __actionC_name = "actionC";

    public Ice.AsyncResult begin_actionC(long aIn)
    {
        return begin_actionC(aIn, null, false, null);
    }

    public Ice.AsyncResult begin_actionC(long aIn, java.util.Map<String, String> __ctx)
    {
        return begin_actionC(aIn, __ctx, true, null);
    }

    public Ice.AsyncResult begin_actionC(long aIn, Ice.Callback __cb)
    {
        return begin_actionC(aIn, null, false, __cb);
    }

    public Ice.AsyncResult begin_actionC(long aIn, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_actionC(aIn, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_actionC(long aIn, Callback_ItemC_actionC __cb)
    {
        return begin_actionC(aIn, null, false, __cb);
    }

    public Ice.AsyncResult begin_actionC(long aIn, java.util.Map<String, String> __ctx, Callback_ItemC_actionC __cb)
    {
        return begin_actionC(aIn, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_actionC(long aIn, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__actionC_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __actionC_name, __cb);
        try
        {
            __result.__prepare(__actionC_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.writeLong(aIn);
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public void end_actionC(Ice.LongHolder aOut, Ice.ShortHolder b, Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __actionC_name);
        if(!__result.__wait())
        {
            try
            {
                __result.__throwUserException();
            }
            catch(Ice.UserException __ex)
            {
                throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
            }
        }
        IceInternal.BasicStream __is = __result.__is();
        __is.startReadEncaps();
        aOut.value = __is.readLong();
        b.value = __is.readShort();
        __is.endReadEncaps();
    }

    public static ItemCPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        ItemCPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ItemCPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    ItemCPrxHelper __h = new ItemCPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ItemCPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        ItemCPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ItemCPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    ItemCPrxHelper __h = new ItemCPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ItemCPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ItemCPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    ItemCPrxHelper __h = new ItemCPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static ItemCPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        ItemCPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    ItemCPrxHelper __h = new ItemCPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static ItemCPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        ItemCPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ItemCPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                ItemCPrxHelper __h = new ItemCPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static ItemCPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ItemCPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            ItemCPrxHelper __h = new ItemCPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::MiddlewareTestbed::Item",
        "::MiddlewareTestbed::ItemC"
    };

    public static String
    ice_staticId()
    {
        return __ids[2];
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _ItemCDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _ItemCDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, ItemCPrx v)
    {
        __os.writeProxy(v);
    }

    public static ItemCPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ItemCPrxHelper result = new ItemCPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}

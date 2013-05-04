#ifndef MIDDLEWARE_TESTBED
#define MIDDLEWARE_TESTBED

module MiddlewareTestbed { 
   exception ItemNotExists {}; 
   exception ItemAlreadyExists {}; 
   exception ItemBusy {};    
   
   interface Item;
   
   interface AFactory {
      Item* createItem(string name, string type) throws ItemAlreadyExists;
      Item* takeItem(string name) throws ItemNotExists, ItemBusy;
      void releaseItem(string name) throws ItemNotExists;
   };
    
   interface Item {
      string getName();
      long getItemAge();
   }; 
   
   interface ItemA extends Item {
      void actionA(float a, out long b);
   }; 
   
   interface ItemB extends Item {
      float actionB(string a);
   }; 
   
   interface ItemC extends Item {
      void actionC(long aIn, out long aOut, out short b);
   }; 
};

#endif

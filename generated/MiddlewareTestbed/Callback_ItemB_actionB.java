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
// Generated from file `Callback_ItemB_actionB.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package MiddlewareTestbed;

public abstract class Callback_ItemB_actionB extends Ice.TwowayCallback
{
    public abstract void response(float __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        ItemBPrx __proxy = (ItemBPrx)__result.getProxy();
        float __ret = (float)0.0;
        try
        {
            __ret = __proxy.end_actionB(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}

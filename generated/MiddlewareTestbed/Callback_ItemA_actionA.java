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
// Generated from file `Callback_ItemA_actionA.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package MiddlewareTestbed;

public abstract class Callback_ItemA_actionA extends Ice.TwowayCallback
{
    public abstract void response(long b);

    public final void __completed(Ice.AsyncResult __result)
    {
        ItemAPrx __proxy = (ItemAPrx)__result.getProxy();
        Ice.LongHolder b = new Ice.LongHolder();
        try
        {
            __proxy.end_actionA(b, __result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(b.value);
    }
}

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
// Generated from file `Callback_AFactory_releaseItem.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package MiddlewareTestbed;

public abstract class Callback_AFactory_releaseItem extends Ice.TwowayCallback
{
    public abstract void response();
    public abstract void exception(Ice.UserException __ex);

    public final void __completed(Ice.AsyncResult __result)
    {
        AFactoryPrx __proxy = (AFactoryPrx)__result.getProxy();
        try
        {
            __proxy.end_releaseItem(__result);
        }
        catch(Ice.UserException __ex)
        {
            exception(__ex);
            return;
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response();
    }
}

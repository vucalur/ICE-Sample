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
// Generated from file `_AFactoryOperationsNC.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package MiddlewareTestbed;

public interface _AFactoryOperationsNC
{
    ItemPrx createItem(String name, String type)
        throws ItemAlreadyExists;

    ItemPrx takeItem(String name)
        throws ItemBusy,
               ItemNotExists;

    void releaseItem(String name)
        throws ItemNotExists;
}
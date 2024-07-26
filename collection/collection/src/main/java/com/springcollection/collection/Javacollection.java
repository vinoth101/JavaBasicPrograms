package com.springcollection.collection;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Javacollection {
    public Set getAddressSet() {
        System.out.println("adressset"+""+addressSet);
        return addressSet;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public Map getAddressMap() {
        System.out.println("addressmap"+""+addressMap);
        return addressMap;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public Properties getAddressProp() {
        System.out.println("adressprop"+""+addressProp);
        return addressProp;
    }

    public void setAddressProp(Properties addressProp) {
        this.addressProp = addressProp;
    }

    List addressList;
    Set addressSet;

    public List getAddressList() {
        System.out.println("adresslist"+""+addressList);
        return addressList;
    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    Map addressMap;
    Properties addressProp;
}

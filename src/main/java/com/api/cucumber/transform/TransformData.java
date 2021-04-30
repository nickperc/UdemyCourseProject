package com.api.cucumber.transform;

import cucumber.api.Transformer;

public class TransformData extends Transformer<String> {

    public String transform(String args) {
        return args + " Transform";
    }
}

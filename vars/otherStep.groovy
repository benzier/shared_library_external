#!/usr/bin/env groovy

import com.p72.miteam.*

def call(Map params){
    echo "OtherStep execution - param name -> ${params.name}"
    return "OtherStep execution was success"
}
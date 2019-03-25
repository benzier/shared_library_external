package com.p72.miteam

import com.p72.devops.stage.factory.*
import com.p72.devops.util.*

class MiteamCheckoutStage extends ICheckoutStage {

    public MiteamCheckoutStage(JenkinsUtils jenkins){
        super(jenkins);
    }

    def postAction(c){
        getJenkins().echo "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"
        getJenkins().echo c
        getJenkins().echo "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"
    }

}
package com.olavgg

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class TestCompileStaticController {

    def index() {
        flash.message = message(code:'hello', default:'Hello')
    }
}

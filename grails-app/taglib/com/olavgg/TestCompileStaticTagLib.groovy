package com.olavgg

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class TestCompileStaticTagLib {
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def hello = {
        render template: '/testCompileStatic/hello'
    }
}

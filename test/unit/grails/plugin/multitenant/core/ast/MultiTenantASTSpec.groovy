package grails.plugin.multitenant.core.ast

import grails.plugin.multitenant.core.MultiTenantDomainClass;
import grails.plugin.multitenant.core.annotation.MultiTenant;
import grails.plugin.spock.UnitSpec;

/**
 * 
 * @author Kim A. Betti
 */
class MultiTenantASTSpec extends UnitSpec {

    def "all classes annotated with MultiTenant should implement MultiTenantDomainClass"() {
        expect:
        def sampleInstance = new SampleDomainClass(name: "test")
        sampleInstance instanceof MultiTenantDomainClass
    }
    
}

@MultiTenant
class SampleDomainClass {
    String name
}
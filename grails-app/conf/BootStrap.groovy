import org.bbop.apollo.FeatureType
import org.bbop.apollo.Role
import org.bbop.apollo.gwt.shared.GlobalPermissionEnum
import org.bbop.apollo.sequence.SequenceTranslationHandler



class BootStrap {

    def sequenceService
    def configWrapperService
    def grailsApplication
    def featureTypeService
    def domainMarshallerService
    def proxyService
    def userService
    def roleService
    def annotatorService
    def phoneHomeService


    def init = { servletContext ->
        log.info "Initializing..."
        def dataSource = grailsApplication.config.dataSource
        log.info "Datasource"
        log.info "Url: ${dataSource.url}"
        log.info "Driver: ${dataSource.driverClassName}"
        log.info "Dialect: ${dataSource.dialect}"

        domainMarshallerService.registerObjects()
        proxyService.initProxies()


        SequenceTranslationHandler.spliceDonorSites.addAll(configWrapperService.spliceDonorSites)
        SequenceTranslationHandler.spliceAcceptorSites.addAll(configWrapperService.spliceAcceptorSites)

        if(FeatureType.count==0){
            featureTypeService.stubDefaultFeatureTypes()
        }

        roleService.initRoles()

        def admin = grailsApplication.config?.apollo?.admin
        if(admin){
            userService.registerAdmin(admin.username,admin.password,admin.firstName,admin.lastName)
        }

        annotatorService.checkCommonDataDirectory()

        phoneHomeService.pingServerAsync(org.bbop.apollo.PhoneHomeEnum.START.value)

    }
    def destroy = {
        phoneHomeService.pingServer(org.bbop.apollo.PhoneHomeEnum.STOP.value)
    }
}

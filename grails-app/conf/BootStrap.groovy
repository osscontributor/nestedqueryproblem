class BootStrap {

    def init = { servletContext ->
        ['one', 'two', 'three'].each { key ->
            new Product(key: key, enable: false).save()
            new Product(key: key, enable: true).save()
        }
    }
    def destroy = {
    }
}

class ProductController {
    
    def index = {
        def products = Product.productsList('one').list()
        render "${products.size()} products were returned"
    }
}
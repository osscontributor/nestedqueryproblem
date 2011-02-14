class Product {

    boolean enable
    String key

    static namedQueries ={
        enabledProduct {
            eq('enable', true)
        }

        productsList { key, enable = true ->
            if (enable) {
                enabledProduct()
            }
            eq('key', key)

        }
    }
}
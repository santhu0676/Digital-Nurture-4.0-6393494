public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shampoo", "Health"),
                new Product(103, "Apple", "Groceries"),
                new Product(104, "Chair", "Furniture"),
        };

        // Linear Search
        Product result1 = SearchService.linearSearch(products, "Shampoo");
        System.out.println("Linear Search Result: " + result1);

        // Sort and Binary Search
        SearchService.sortProductsByName(products);
        Product result2 = SearchService.binarySearch(products, "Apple");
        System.out.println("Binary Search Result: " + result2);
    }
}

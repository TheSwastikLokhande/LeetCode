public class Tester {
    public static int searchCustomerId(int[] customerIds, int customerIdToBeSearched) {
        int low = 0;
        int high = customerIds.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (customerIds[mid] == customerIdToBeSearched)
                return mid;

            if (customerIds[mid] < customerIdToBeSearched)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1; // Return -1 if the customer ID is not found
    }

    public static void main(String[] args) {
        int[] customerIds = { 80451, 80462, 80465, 80479, 80550, 80561, 80665, 80770 };
        int customerIdToBeSearched = 80462;

        int index = searchCustomerId(customerIds, customerIdToBeSearched);

        if (index == -1)
            System.out.println("Customer Id " + customerIdToBeSearched + " is not found!");
        else
            System.out.println("Customer Id " + customerIdToBeSearched + " is found at index position " + index+"!");
    }
}

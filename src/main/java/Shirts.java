public class Shirts {

    public static void main(String[] args) {

        final int oneShirtPrice = 3500;
        System.out.println("oneShirtPrice = " + oneShirtPrice);

        final int chosenShirts = 2;
        System.out.println("chosenShirts = " + chosenShirts);

        final int countShirtsForDiscount = 3;
        System.out.println("countShirtsForDiscount = " + countShirtsForDiscount);

        final int shirtsNeededMoreForDiscount = countShirtsForDiscount - chosenShirts;
        System.out.println("shirtsNeededMoreForDiscount = " + shirtsNeededMoreForDiscount);

        final int totalPriceChosenShirts = oneShirtPrice * chosenShirts;
        System.out.println("totalPriceChosenShirts = " + totalPriceChosenShirts);

        final int priceOfShirtsNeededMoreForDiscount = shirtsNeededMoreForDiscount * oneShirtPrice;
        System.out.println("priceOfShirtsNeededMoreForDiscount = " + priceOfShirtsNeededMoreForDiscount);

        final double discount = 40;
        System.out.println("discount = " + discount);

        final double totalDiscountPrice = ((totalPriceChosenShirts + priceOfShirtsNeededMoreForDiscount) * (100 - discount)) / 100;
        System.out.println("totalDiscountPrice = " + totalDiscountPrice);

        final double oneShirtDiscountPrice = (oneShirtPrice * (100 - discount) / 100);
        System.out.println("oneShirtDiscountPrice = " + oneShirtDiscountPrice);

        final double totalSave = (totalPriceChosenShirts + priceOfShirtsNeededMoreForDiscount) - totalDiscountPrice;
        System.out.println("totalSave = " + totalSave);

        final double freeShirts = totalSave / oneShirtPrice;
        System.out.println("freeShirts = " + freeShirts);
    }
}


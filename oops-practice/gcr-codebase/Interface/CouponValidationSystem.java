interface CouponValidator {
    boolean validateCoupon(String code);
    static boolean isLengthValid(String code) {
        return code != null && code.length() >= 5 && code.length() <= 10;
    }
}

class ShoppingCart implements CouponValidator {
    @Override
    public boolean validateCoupon(String code) {
        if (!CouponValidator.isLengthValid(code)) {
            return false;
        }
        // Dummy logic for coupon validation
        return code.startsWith("DISCOUNT") || code.startsWith("FEST");
    }
}

public class CouponValidationSystem {
    public static void main(String[] args) {
        String[] coupons = {"DISCOUNT20", "INVALID", "FEST50", "SHORT"};
        ShoppingCart cart = new ShoppingCart();
        
        for (String coupon : coupons) {
            boolean isValid = cart.validateCoupon(coupon);
            System.out.println("Coupon: " + coupon + " -> " + (isValid ? "Valid" : "Invalid"));
        }
    }
}

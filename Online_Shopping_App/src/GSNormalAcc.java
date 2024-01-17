
class GSNormalAcc extends NormalAcc {
	private static final float charges = 50;
	private static final float deliveryCharges = 20;

	public GSNormalAcc(int accNo, String accNm) {
		super(accNo, accNm, charges, deliveryCharges);
	}

	@Override
	public void bookProduct() {
		System.out.println("Booking product for Normal Acc\n");
	}
}
package JavaCodesDay5;

		
		
		

		// Property class definition

		class RealEstateProperty {
		    private String address;
		    private double price;
		    private int bedrooms;

		    public RealEstateProperty(String addr, double price, int beds) {
		        this.address = addr;
		        this.price = price;
		        this.bedrooms = beds;
		    }

		    public String getAddress() {
		        return address;
		    }

		    public double getPrice() {
		        return price;
		    }

		    public int getBedrooms() {
		        return bedrooms;
		    }

		    @Override
		    public String toString() {
		        return String.format("Property[address='%s', price=%.2f, bedrooms=%d]",
		                address, price, bedrooms);
		    }
		}

		// Main application class
		
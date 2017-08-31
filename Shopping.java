package Exercise;

public class Shopping extends People {
	
	
	private float value;
	private float plots;
	private int qntdPlots;

	public Shopping(float value) {
		this.value = value;
	}
	
	public void BuyAtSight() {
			if (isPhysicalPerson() == true) {
				this.value = this.value - 5;
			}else {
				this.value = this.value - 10;
			}
		}
	
	public void InstallmentPurchase(int qntdPlots) {
		this.qntdPlots = qntdPlots;
		this.plots = 1;
		if (isPhysicalPerson() == true) {
			while (plots <= qntdPlots) {
				this.plots = this.plots + 1;
				this.value = this.value + 3;
			}
		}else {
			while (plots <= qntdPlots) {
				this.plots = this.plots + 1;
				this.value = this.value + 5;
			}
		}	
	}
	
	
	
	

	public float getValue() {
		return value;
	}

	public float getPlots() {
		return plots;
	}

	public int getQntdPlots() {
		return qntdPlots;
	}

	public void Status() {
		System.out.println("O valor final da compra é: "+ this.value);
	}
	}


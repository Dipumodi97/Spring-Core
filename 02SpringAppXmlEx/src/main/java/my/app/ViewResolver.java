package my.app;

public class ViewResolver {
	
	private String prefix;
	private String suffix;
	
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public ViewResolver() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ViewResolver [prefix=" + prefix + ", suffix=" + suffix + "]";
	}
	
	

}

package Enum;

public enum Model {
	XUHUI,CHUNHUI,WEIKANG;
	public String toString() {
		switch(this){
		case XUHUI: return "xuhui";
		case CHUNHUI: return "chunhui";
		case WEIKANG: return "weikang";
		default:return null;
		}
	}
}


public class Client {

	public static void main(String args[]) {
		Search search;
		search = new ProxySearch();
		search.doSearch("muskmelon", "lvahng");
	}
	
//注意：代理模式相当于就是再外面封一层，类里面维持一个对RealSearch的引用，注意抽象的运用，proxysearch和realsearch继承至一个抽象。
}

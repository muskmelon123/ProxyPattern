
public class ProxySearch implements Search {

	Search realSearch;
	
	public ProxySearch() {
		this.realSearch = new RealSearch();
	}
	
	@Override
	public void doSearch(String userId,String keyWord) {
		// TODO Auto-generated method stub
		if(validate(userId)) {
			realSearch.doSearch(userId, keyWord);
		}
	}
	
	public Boolean validate(String userId) {
		return AccessValidater.validate(userId);
	}

}

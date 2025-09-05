package sec01;

import java.util.ArrayList;

public class CafeOrderSystem {
	ArrayList menuList;
	
	CafeOrderSystem (){
		menuList = new ArrayList();
		menuList.add(new MenuItem("아메리카노", 3000));
		menuList.add(new MenuItem("카페라떼", 3500));
		menuList.add(new MenuItem("돌체라떼", 4000));
		menuList.add(new MenuItem("카푸치노", 4500));
	}
	
	void showMenu() {
		System.out.println("{메뉴판}");
		for( int i = 0; i < menuList.size(); i++) {
			MenuItem item = (MenuItem)menuList.get(i);
			item.info();		
		}
	}	
	
	void order(String name) {
		boolean found = false;
		for(int i = 0; i < menuList.size(); i++) {
			MenuItem item = (MenuItem)menuList.get(i);
			if(item.name.equals(name)) {
			System.out.println("["+item.name+"] 주문완료 ("+item.price+"원)");
			found = true;
			break;
			}
		}
		if(!found) {
			System.out.println("해당 메뉴는 없어용~");
		}
	}
	
	
	
	
}

package sec02.exam01;

import java.util.Comparator;

public class ComparatorImpl implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		MemberDTO dto1 =(MemberDTO) o1;
		MemberDTO dto2 =(MemberDTO) o2;
		
		int result = dto1.age - dto2.age;  //오름차순입니다. 반대로하면 내림차순.
		
		return result;
	}

}

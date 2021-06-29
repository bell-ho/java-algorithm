package doit.map.hashmap;

import doit.collectionStudy.collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memId) {
        if (hashMap.containsKey(memId)) {
            hashMap.remove(memId);
            return true;
        } else {
            System.out.println(memId + "존재 x");
            return false;
        }
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator(); //keySet() : 모든 key값이 set객체로 반환 반환된 set객체를 iterator()메서드로 호출
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}

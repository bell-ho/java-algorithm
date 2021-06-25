package doit.collectionStudy.collection.arraylist;

import doit.collectionStudy.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(1001, "a");
        Member member2 = new Member(1002, "b");
        Member member3 = new Member(1003, "c");
        Member member4 = new Member(1004, "d");
        Member member5 = new Member(1007, "7");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);
        memberArrayList.addMember(member4);

        memberArrayList.addMemberC(member5, 0);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(member1.getMemberId());

        memberArrayList.showAllMember();

    }
}




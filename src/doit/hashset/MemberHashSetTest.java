package doit.hashset;

import doit.collectionStudy.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(100, "a");
        Member member2 = new Member(200, "b");
        Member member3 = new Member(300, "c");

        memberHashSet.addMemberSet(member1);
        memberHashSet.addMemberSet(member2);
        memberHashSet.addMemberSet(member3);

        memberHashSet.showAllMember();

        Member member4 = new Member(100, "b");
        memberHashSet.addMemberSet(member4);
        memberHashSet.showAllMember();

    }
}

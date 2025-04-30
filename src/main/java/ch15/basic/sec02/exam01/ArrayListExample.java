package ch15.basic.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        //객체 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        System.out.println("총 객체 수 : " + list.size());
        Board board = list.get(2);

        System.out.println(board.getSubject() + "\t" + board.getContent() +
                "\t" + board.getWriter());


        for (int i = 0; i< list.size(); i++){
            Board board1 = list.get(i);
            System.out.println(board1.getSubject() + "\t" + board1.getContent() +
                    "\t" + board1.getWriter());
        }
        System.out.println();
        //객체 삭제
        list.remove(2);
        list.remove(2);

        for (Board board1 : list){
            System.out.println(board1.getSubject() + "\t" + board1.getContent() +
                    "\t" + board1.getWriter());
        }

    }
}

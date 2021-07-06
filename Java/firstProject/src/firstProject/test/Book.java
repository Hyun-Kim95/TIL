package firstProject.test;

public class Book {
	String title;
	String author;
	void show() {
		System.out.println(title+" "+author);
	}
	public Book() {
		this("", "");	// 무조건 this()는 첫번째 문장이어야 함
		System.out.println("생성자 호출됨");	// 얘가 위로 가면 오류
	}
	public Book(String title) {
		this(title, "작자미상");
		System.out.println("public Book(String title) 생성자 호출");
	}
	public Book(String title, String author) {
		System.out.println("public Book(String title, String author)");
		// 얘는 생성자를 호출하지 않아서 위에 써도 오류가 나지 않음
		this.title = title;
		this.author = author;
	}
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();
		loveStory.show();

	}
}
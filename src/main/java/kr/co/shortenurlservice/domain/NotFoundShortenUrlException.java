package kr.co.shortenurlservice.domain;

public class NotFoundShortenUrlException extends RuntimeException {

    // 메시지를 전달받는 생성자
    public NotFoundShortenUrlException(String message) {
        super(message);
    }

}

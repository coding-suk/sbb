package com.example.sbb;

import com.example.sbb.Entity.Answer;
import com.example.sbb.Entity.Question;
import com.example.sbb.Repository.AnswerRepository;
import com.example.sbb.Repository.QuestionRepository;
import com.example.sbb.Service.QuestionService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {
	@Autowired
	private QuestionService questionService;

	@Test
	void TestJpa() {
		for (int i = 0; i <= 300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content);
		}
	}
}

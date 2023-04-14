## 프로젝트 준비
	a_mvc_ex 복사
	a_mvc_mybatis_config 생성
	
## 마이바티스 모듈 추가
	mybatis
	mybatis-spring 2.x.x
	
## 마이바티스 설정
	설정 파일 : com.jafa.config.RootConfig
	@MapperScan 매퍼 인터페이스 패키지 설정
	SqlSessionFactoryBean
		- DataSource빈 전달
		- mapperLoacations : classpath:mappers/**/*Mapper.xml
	SqlSessionTemplate
		- SqlSessionFactory : SqlSessionFactoryBean.getObject()로 부터 받는다.
		- SqlSessionFactory빈 생성자 주입
		
## 매퍼 인터페이스 및 매퍼 XML 작성
	- 매퍼인터페이스 : com.jafa.repository.TestRepository
	- 매퍼 파일 : classpath:mappers/TestMapper.xml
	- 테스트 케이스 : com.jafa.mybatis.TestRepositoryTest

## log4j 설정
	- 모듈 추가
		log4j
		slf4j-log4j12
		jcl-over-slf4j
		spring-core : exclude(commons-logging)
	- 로그 설정 파일 : classpath:log4j.xml
	
## log4jdbc-log4j2 설정
	- RootConfig에서 DataSource 재설정
	- log4jdbc-log4jdbc.log4j2.properties
	- log4j.xml 로그레벨 조정
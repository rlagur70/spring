package com.koreait.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 	@Configuration
 	: 안녕. 난 app-context.xml 하고 같은일을 하는 클래스야.
 */





@Configuration
public class AppContext {

	// 메소드 하나당 Bean을 하나씩 만듭니다
	// Bean을 만드는 메소드들은 @Bean 에너테이션을 추가해야 합니다.
	
	/*
	 * 	<bean id="song1" class="com.koreait.spring.Song">
	 * 		<proprety name="title" value="Dynamite" />
	 * 		<proprety name="genre" value="댄스" />	
	 * 	</bean>
	 * 
	 * 아래 메소드를 위 <bean> 태그와 같은 일을 해요
	 */
	
	@Bean	// 이 메소드는 Bean을 만드는 메소드입니다.
	public Song song1() {	// <bean id="song1" class="com.koreait.spring.Song">
		Song song = new Song();	
		song.setTitle("Dynamite");	// <proprety name="title" value="Dynamite" />
		song.setGenre("댄스");		// <proprety name="genre" value="댄스" />
		return song;
	}
	
	/*
	 * 	<bean id="song2" class="com.koreait.spring.Song">
	 * 		<constructor-arg value="Dynamite" />
	 * 		<constructor-arg value="댄스" />	
	 * 	</bean>
	 * 
	 * 아래 메소드를 위 <bean> 태그와 같은 일을 해요
	 */
	@Bean(name="song2")		// @Bean(name="bean의 id")
	public Song zzzzz() {	// 메소드의 이름 zzzzz는 사용되지 않아요.
		return new Song("Dynamite", "댄스");
	}

	/*
	 * 	<bean id="singer" class="com.koreait.spring.Singer">
	 * 		<proprety name="name" value="BTS" />
	 * 		<proprety name="song" value="son1" />
	 * 	</bean>
	 * 
	 * 아래 메소드를 위 <bean> 태그와 같은 일을 해요
	 */
	
	@Bean
	public Singer singer1() {
		Singer singer = new Singer();
		singer.setName("BTS");
		singer.setSong(song1());	// public Song song(){} 메소드를 호출하면 song1리나는 bean이 반환됨
		return singer;
	} 
	
	/*
	 * 	<bean id="singer2" class="com.koreait.spring.Singer">
	 * 		<proprety name="name" value="BTS" />
	 * 		<proprety name="song" value="song2" />
	 * 	</bean>
	 * 
	 * 아래 메소드를 위 <bean> 태그와 같은 일을 해요
	 */
	
	@Bean 
	public Singer singer2() {
		return new Singer("BTS",zzzzz());	//public Song zzzzz(){} 메소드를 호출하면 song2라는 Bean이 반환됨
	}
	
}

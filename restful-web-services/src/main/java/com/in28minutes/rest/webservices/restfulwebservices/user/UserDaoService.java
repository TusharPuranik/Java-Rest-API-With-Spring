package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	private static int usersCount=0;
	
	
	static {
		users.add(new User(++usersCount,"Tushar",LocalDate.now().minusYears(22)));
		users.add(new User(++usersCount,"Pooja",LocalDate.now().minusYears(22)));
		users.add(new User(++usersCount,"Lily",LocalDate.now().minusYears(1)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	
	public User findOne(int id) {
		//functional Programming
		Predicate<? super User> predicate = user -> 
				Integer.valueOf(user.getId()).equals(id); 
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public void deleteById(int id) {
		//functional Programming
		Predicate<? super User> predicate = user -> 
				Integer.valueOf(user.getId()).equals(id); 
				users.removeIf(predicate);
	}
	
	
	
	
}

package ch.uzh.ifi.hase.soprafs26.controller;

import ch.uzh.ifi.hase.soprafs26.service.PasswordService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ch.uzh.ifi.hase.soprafs26.entity.User;
import ch.uzh.ifi.hase.soprafs26.rest.dto.UserGetDTO;
import ch.uzh.ifi.hase.soprafs26.rest.dto.UserPostDTO;
import ch.uzh.ifi.hase.soprafs26.rest.mapper.DTOMapper;
import ch.uzh.ifi.hase.soprafs26.service.UserService;

@RestController
public class RegistrationController {

	private final UserService userService;
    private final PasswordService passwordService;

	RegistrationController(UserService userService, PasswordService passwordService) {
		this.userService = userService;
        this.passwordService = passwordService;
	}

	@PostMapping("/register")
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public UserGetDTO createUser(@RequestBody UserPostDTO userPostDTO) {
		User userInput = DTOMapper.INSTANCE.convertUserPostDTOtoEntity(userPostDTO);
        userInput.setPassword(passwordService.hashPassword(userInput.getPassword()));

		User createdUser = userService.createUser(userInput);
		return DTOMapper.INSTANCE.convertEntityToUserGetDTO(createdUser);
	}
}

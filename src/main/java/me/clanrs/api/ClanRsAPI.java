package me.clanrs.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clan")
public class ClanRsAPI {
	
	@GetMapping
	public String getClan() {
		return "clan.me";
	}

}

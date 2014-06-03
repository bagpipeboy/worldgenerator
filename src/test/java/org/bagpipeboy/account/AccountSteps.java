package org.bagpipeboy.account;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import org.bagpipeboy.config.WebSecurityConfigurationAware;
import org.springframework.test.web.servlet.ResultActions;

import cucumber.api.java.Before;
import cucumber.api.java.de.*;

public class AccountSteps extends WebSecurityConfigurationAware {
	
	private ResultActions res;
	
	@Before
	public void setup() {
		before();
	}

	@Angenommen("^ich bin ein unbekannter User$")
	public void unknown_user() {
		// do nothing
	}
	
	@Wenn("^ich meine Account Seite aufrufe$")
	public void access_account_page() throws Exception {
        res = mockMvc.perform(get("/account/current"));
	}
	
	@Dann("^sollte ich auf die \"(.+)\" Seite weitergeleitet werden$")
	public void redirect_to_login(String pageName) throws Exception {
		switch (pageName) {
			case "Login":
				res.andExpect(redirectedUrl("http://localhost/signin"));
				break;
			default:
				throw new IllegalArgumentException(pageName + " is not a valid page name");
		}
	}
	
}

package com.wgghana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class NavigationController {

	@RequestMapping(value = "/clientlogin")
	public String clientLogin() {
		return "client/clientlogin";
	}

	@RequestMapping(value = "/transaction")
	public String transaction() {
		return "client/transaction";
	}

	@RequestMapping(value = "/createtransaction")
	public String createTransaction() {
		return "client/createtransaction";
	}

	@RequestMapping(value = "/edittransaction")
	public String editTransaction() {
		return "client/edittransaction";
	}

	@RequestMapping(value = "/client_document")
	public String clientDocument() {
		return "client/client_document";
	}
	
	@RequestMapping(value = "/clientdashboard")
	public String clientDashboard() {
		return "client/clientdashboard";
	}

	@RequestMapping(value = "/institutionprofile")
	public String institutionProfile() {
		return "client/institutionprofile";
	}

	@RequestMapping(value = "/institutionprofile_edit")
	public String institutionProfileEdit() {
		return "client/institutionprofile_edit";
	}

	@RequestMapping(value = "/client_inbox")
	public String clientInbox() {
		return "client/client_inbox";
	}

	@RequestMapping(value = "/client_draft")
	public String clientDraft() {
		return "client/client_draft";
	}

	@RequestMapping(value = "/client_sent_messages")
	public String clientSentMessages() {
		return "client/client_sent_messages";
	}

	@RequestMapping(value = "/client_selected_message")
	public String clientSelectedMessage() {
		return "client/client_selected_message";
	}

	@RequestMapping(value = "/client_compose")
	public String clientCompose() {
		return "client/client_compose";
	}

	@RequestMapping(value = "/admin_inbox")
	public String adminInbox() {
		return "admin/admin_inbox";
	}

	@RequestMapping(value = "/admin_draft")
	public String adminDraft() {
		return "admin/admin_draft";
	}

	@RequestMapping(value = "/admin_sent_messages")
	public String adminSentMessages() {
		return "admin/admin_sent_messages";
	}

	@RequestMapping(value = "/admin_compose")
	public String adminCompose() {
		return "admin/admin_compose";
	}

	@RequestMapping(value = "/admin_selected_message")
	public String adminSelectedMessage() {
		return "admin/admin_selected_message";
	}

	@RequestMapping(value = "/dashboard")
	public String dashboard() {
		return "admin/dashboard";
	}

	@RequestMapping(value = "/admin")
	public String adminLogin() {
		return "admin/adminlogin";
	}

	@RequestMapping(value = "/addinstitution")
	public String addInstitution() {
		return "admin/addinstitution";
	}

	@RequestMapping(value = "/editinstitution")
	public String editInstitution() {
		return "admin/editinstitution";
	}

	@RequestMapping(value = "/institutions")
	public String institutions() {
		return "admin/institutions";
	}

	@RequestMapping(value = "/letters")
	public String letters() {
		return "admin/letters";
	}

	@RequestMapping(value = "/memo")
	public String memo() {
		return "admin/memo";
	}

	@RequestMapping(value = "/useraccount")
	public String userAccount() {
		return "admin/useraccount";
	}

	@RequestMapping(value = "/report")
	public String report() {
		return "admin/report";
	}

	@RequestMapping(value = "/settings")
	public String settings() {
		return "admin/settings";
	}
}

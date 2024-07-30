package com.curso.branas.outbound.hibernate.repository;

import com.curso.branas.core.domain.entity.Account;
import com.curso.branas.core.domain.repository.AccountRepository;
import com.curso.branas.outbound.hibernate.mapper.PanacheAccountMapper;
import com.curso.branas.outbound.hibernate.table.PanacheAccount;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PanacheAccountRepository implements AccountRepository {

	@Inject
	PanacheAccountMapper panacheAccountMapper;

	@Override
	public Boolean existsByEmail(String email) {
		return PanacheAccount.count("email", email) > 0;
	}

	@Override
	public Account save(Account account) {
		PanacheAccount panacheAccount = panacheAccountMapper.to(account);
		panacheAccount.persist();
		return panacheAccountMapper.from(panacheAccount);
	}

}

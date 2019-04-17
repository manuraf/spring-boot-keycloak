package it.ifm.springinaction.licenses.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.ifm.springinaction.licenses.model.License;

public interface LicenseRepository extends CrudRepository<License, String> {
	
	public List<License> findByOrganizationId(String organizationId);
	
	public License findByOrganizationIdAndLicenseId(String organizationId,String licenseId);
}

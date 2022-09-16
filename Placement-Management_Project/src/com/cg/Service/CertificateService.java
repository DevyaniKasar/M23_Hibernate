package com.cg.Service;

import com.cg.Entities.Certificate;

public interface CertificateService {
	
	Certificate addCertificate(Certificate certificate);
	Certificate updateCertificate(Certificate certificate);
	Certificate searchCertificate(int cert_id);
	Certificate deleteCertificate(int cert_id);




}

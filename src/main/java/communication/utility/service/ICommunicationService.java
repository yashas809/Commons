package communication.utility.service;

import communication.utility.dao.CaseInfo;
import communication.utility.dao.Communication;

import java.util.List;


public interface ICommunicationService
{
    public Communication createCase(Communication request);

    public List<Communication> getMessages(long caseId);

    public List<CaseInfo> getCaseId(long Id);

    public boolean SendMessage(long caseId, Communication request);

    public boolean isInvestigationExists(long toId, long fromId);
}

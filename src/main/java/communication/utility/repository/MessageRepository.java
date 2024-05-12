package communication.utility.repository;

import communication.utility.entity.MessagesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MessageRepository extends JpaRepository<MessagesEntity, Long> {

    public List<MessagesEntity> findBycaseIDFK(long caseIDFK);
}

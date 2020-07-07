package sucaisheng.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountService {

    @Autowired
    AccountDao accountDao;

    /*@Autowired
    TransactionTemplate transactionTemplate;*/

    public void transfer(int fromIdd, int toId, double money){

//        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//            @Override
//            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
//                accountDao.reduceMoney(fromIdd, money);
//                accountDao.addMoney(toId, money);
//            }
//        });
        accountDao.reduceMoney(fromIdd, money);
        int i= 1/0;
        accountDao.addMoney(toId, money);
    }
}

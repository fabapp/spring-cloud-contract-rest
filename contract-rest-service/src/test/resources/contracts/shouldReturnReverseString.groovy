package contracts

import org.springframework.cloud.contract.spec.Contract
Contract.make {
    description "should return naibaF when path is /reverse/Fabian."
    request{
        method GET()
        url("/reverse/Fabian") {
//            queryParameters {
//                parameter("stringToReverse", "Fabian")
//            }
        }
    }
    response {
        body("naibaF")
        status 200
    }
}
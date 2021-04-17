curl --location --request POST 'http://localhost:8080/api/processOrder' \
--header 'Content-Type: application/json' \
--header 'Authorization: Basic TUFHSUM6QVlUZDZ3R0I=' \
--data-raw '{
    "OrderNumber": "1111",
    "OrderType": "SHIP_TO_HOME",
    "OrderDate": "2021-03-20",
    "OrderLines": [
        {
            "OrderLineNumber": "1",
            "LineStatus": "CREATED",
            "LineTotalWithoutTax": 10,
            "LineCharges": [
                {
                    "ChargeType": "SHIPPING",
                    "ChargeAmount": 1.2
                },
                {
                    "ChargeType": "HANDLING_CHARGE",
                    "ChargeAmount": 0.2
                }
            ],
            "Taxes": [
                {
                    "TaxType": "GST",
                    "TaxAmount": 0.6
                }
            ]
        },
        {
            "OrderLineNumber": "2",
            "LineStatus": "CANCELLED",
            "LineTotalWithoutTax": 5,
            "LineCharges": [
                {
                    "ChargeType": "SHIPPING",
                    "ChargeAmount": 0.6
                }
            ],
            "Taxes": [
                {
                    "TaxType": "GST",
                    "TaxAmount": 0.3
                }
            ]
        },
        {
            "OrderLineNumber": "2",
            "LineStatus": "RETURNED",
            "LineTotalWithoutTax": 2,
            "LineCharges": [
            ],
            "Taxes": [
                {
                    "TaxType": "GST",
                    "TaxAmount": 0.5
                }
            ]
        }
    ]
}'

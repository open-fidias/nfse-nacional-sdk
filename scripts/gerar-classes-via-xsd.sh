#!/usr/bin/env bash

set -o nounset
set -o errexit
set -o pipefail

xjc -nv -d src/main/java/ src/main/resources/schemas/1.01/*.xsd -p br.com.nfse.xsd


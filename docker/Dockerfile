FROM rocker/r-base

MAINTAINER "Tilaye Yismaw" tilaye@gmail.com 
RUN apt-get update && apt-get install -y \
  telnet \
  procps

RUN install2.r --error \
    -r "https://cran.rstudio.com" \
    Rserve && \
    rm -rf /tmp/downloaded_packages/ /tmp/*.rds

EXPOSE 6311
ENTRYPOINT R -e "Rserve::run.Rserve(remote=TRUE)"


FROM rocker/r-base

MAINTAINER "Tilaye Yismaw" tilaye@gmail.com 
RUN apt-get update && apt-get install -y \
  telnet \
  procps \
  lbzip2 \
  libfftw3-dev \
  libgdal-dev \
  libgeos-dev \
  libgsl0-dev \
  libgl1-mesa-dev \
  libglu1-mesa-dev \
  libhdf4-alt-dev \
  libhdf5-dev

RUN apt-get update && apt-get install -y \
  libjq-dev \
  libpq-dev \
  libproj-dev \
  libprotobuf-dev \
  libnetcdf-dev \
  libsqlite3-dev \
  libssl-dev \
  libudunits2-dev \
  netcdf-bin \
  postgis \
  protobuf-compiler \
  sqlite3 \
  tk-dev \
  unixodbc-dev

RUN install2.r --error \
  -r "https://cran.rstudio.com" \
  Rserve \
  spdep

RUN rm -rf /tmp/downloaded_packages/ /tmp/*.rds

EXPOSE 6311
ENTRYPOINT R -e "Rserve::run.Rserve(remote=TRUE)"

